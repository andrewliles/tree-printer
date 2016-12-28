package hu.webarticum.treeprinter;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	static public int getDepth(TreeNode treeNode) {
		List<TreeNode> levelNodes = new ArrayList<TreeNode>();
		levelNodes.add(treeNode);
		int depth = 0;
		while (true) {
			List<TreeNode> newLevelNodes = new ArrayList<TreeNode>();
			for (TreeNode levelNode: levelNodes) {
				newLevelNodes.addAll(levelNode.getChildren());
			}
			if (newLevelNodes.isEmpty()) {
				break;
			}
			levelNodes = newLevelNodes;
			depth++;
		}
		return depth;
	}
	
}