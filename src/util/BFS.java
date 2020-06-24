package util;

/**
 * @author 叶振东
 * @date 2019-01-28
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    private static final int M = 4;
    private static final int N = 4;
    /**
     * 迷宫布局：1表示障碍物
     */
    int[][] maze;
    /**
     * 方向：左上右下
     */
    int[][] stepArr = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    /**
     * 标记是否已经访问过
     */
    int[][] visit;

    public BFS() {
        maze = new int[][]{
                {0, 0, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 0, 1},
                {0, 0, 0, 0}};
        visit = new int[4][4];
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        if (bfs.bfs() < 0) {
            System.out.println("Fail! Maybe no solution");
        }

    }

    public int bfs() {
        Node node = new Node(0, 0, -1, -1, 0);
        Queue<BFS.Node> queue = new LinkedList<>();
        Stack<BFS.Node> stack = new Stack<>();
        queue.offer(node);
        //visit[0][0] = 1;
        while (!queue.isEmpty()) {
            Node head = queue.poll();
            //用于回溯路径
            stack.push(head);
            System.out.println(head.x+","+head.y+","+head.preX+","+head.preY);
            visit[head.x][head.y] = 1;
            for (int i = 0; i < 4; i++) {
                int x = head.x + stepArr[i][0];
                int y = head.y + stepArr[i][1];
                //exit
                if (x == M - 1 && y == N - 1 && maze[x][y] == 0 && visit[x][y] == 0) {
                    //打印路径
                    Node top = stack.pop();
                    System.out.println("steps:" + (top.step + 1));
                    System.out.println("the path:");
                    System.out.println((M - 1) + "," + (N - 1));
                    System.out.println(top.x + "," + top.y);
                    int preX = top.preX;
                    int preY = top.preY;
                    while (!stack.isEmpty()) {
                        top = stack.pop();
                        if (preX == top.x && preY == top.y) {
                            System.out.println(preX + "," + preY);
                            preX = top.preX;
                            preY = top.preY;
                        }

                    }
                    return 0;
                }
                //bfs
                if (x >= 0 && x < M && y >= 0 && y < N && maze[x][y] == 0 && visit[x][y] == 0) {
                    Node newNode = new Node(x, y, head.x, head.y, head.step + 1);
                    queue.offer(newNode);
                }

            }
        }
        return -1;
    }

    class Node {
        int preX, preY;
        int step;
        int x, y;

        Node(int x, int y, int preX, int preY, int step) {
            this.x = x;
            this.y = y;
            this.preX = preX;
            this.preY = preY;
            this.step = step;
        }
    }

}

