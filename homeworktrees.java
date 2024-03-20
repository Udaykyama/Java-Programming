public class BinaryNode<S extends Comparable> {

private S key;

private BinaryNode<S> leftSubTree;

private BinaryNode<S> rightSubTree;

public BinaryNode(S key) {

this.key = key;

}

public S getKey() {

return key;

}

public BinaryNode<S> getLeftSubTree() {

return leftSubTree;

}

public BinaryNode<S> getRightSubTree() {

return rightSubTree;

}

public BinaryNode<S> insertKey(S element, BinaryNode<S> rootNode) {

if (rootNode == null)

return new BinaryNode(key);

int comapareResult = element.compareTo(rootNode.key);

if (comapareResult <= 0) {

rootNode.leftSubTree = insertKey(element, rootNode.leftSubTree);

} else {

rootNode.rightSubTree = insertKey(element, rootNode.rightSubTree);

}

return rootNode;

}

}

----------- Binary Search Tree class -----------

import java.util.ArrayList;

import java.util.Stack;

public class BST<S extends Comparable> {

public S getRootKey(BinaryNode<S> bstRoot)

{

return (isBSTEmpty(bstRoot) ? null : bstRoot.getKey());

}

public BinaryNode<S> getLeftSubTree(BinaryNode<S> bstRoot) {

return (isBSTEmpty(bstRoot) ? null : bstRoot.getLeftSubTree());

}

public BinaryNode<S> getRightSubTree(BinaryNode<S> bstRoot) {

return (isBSTEmpty(bstRoot) ? null : bstRoot.getRightSubTree());

}

public boolean isBSTEmpty(BinaryNode<S> bstRoot) {

return bstRoot == null;

}

public BinaryNode<S> createEmptyBST() {

return null;

}

public BinaryNode<S> insertKey(S key, BinaryNode<S> bstRoot) {

bstRoot = bstRoot.insertKey(key, bstRoot);

return bstRoot;

}

/*

travers inorder using stack

*/

public S[] travers(BinaryNode<S> bstRoot) {

ArrayList<S> arrayList = new ArrayList<>();

Stack<BinaryNode<S>> stack = new Stack();

BinaryNode<S> current = bstRoot;

while (current != null || !stack.empty()) {

//check for left sub tree & push until left leaf.

while (current != null) {

stack.push(current);

current = current.getLeftSubTree();

}

current = stack.pop(); //pop & consume the key

arrayList.add(current.getKey());

current = current.getRightSubTree();// check for right sub tree

}

return (S[]) arrayList.toArray();

}

}

------------------------SortIntegers class ------------

public class SortIntegers {

public Integer[] sortIntegerArray(Integer[] input) {

Integer[] output = null;

BST<Integer> bst = new BST<>();

BinaryNode<Integer> bstRoot = bst.createEmptyBST();

for (Integer element : input) {

bstRoot = bst.insertKey(element, bstRoot);

}

output = bst.travers(bstRoot);

return output;

}

}