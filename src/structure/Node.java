package structure;

import java.util.List;

/**
 * @author 叶振东
 * @date 2019-06-18
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
