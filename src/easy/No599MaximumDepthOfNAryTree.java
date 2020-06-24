package easy;

import structure.Node;

import java.util.List;

/**
 * @author 叶振东
 * @date 2019-06-18
 */
public class No599MaximumDepthOfNAryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int deepth = 0;
        for (int i = 0; i < root.children.size(); i++) {
            deepth = Math.max(deepth, maxDepth(root.children.get(i)));
        }
        return deepth + 1;
    }
}
