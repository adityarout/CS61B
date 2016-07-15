public class BinaryTree {

    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode t) {
        root = t;
    }

    public TreeNode getRoot() {
        return root;
    }


    public void print() {
    if (root != null) {
        root.print(0);
    }
    }

    //In TreeNode
    private static final String indent1 = "    ";

    private void print(int indent) {
    // TODO your code here
    println (item, indent);
    // TODO your code here
    }

    private static void println(Object obj, int indent) {
    for (int k=0; k<indent; k++) {
        System.out.print(indent1);
    }
    System.out.println(obj);
    }

    // Print the values in the tree in preorder: root value first,
    // then values in the left subtree (in preorder), then values
    // in the right subtree (in preorder).
    public void printPreorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printPreorder();
            System.out.println();
        }
    }

    // Print the values in the tree in inorder: values in the left
    // subtree first (in inorder), then the root value, then values
    // in the right subtree (in inorder).
    public void printInorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printInorder();
            System.out.println();
        }
    }

    public void fillSampleTree1() {
        TreeNode temp = new TreeNode("a");
        root = new TreeNode("a", temp, temp);
    }

    public void fillSampleTree2() {
        root = new TreeNode("a", new TreeNode("b", new TreeNode("d",
                new TreeNode("e"), new TreeNode("f")), null), new TreeNode("c"));
    }

    public boolean check() { 
    alreadySeen = new ArrayList(); 
    try { 
        isOK(root); 
        return true; 
    } catch (IllegalStateException e) { 
        return false; 
    } 
    }

    protected void isOK(TreeNode t) throws IllegalStateException {
        Iterator<TreeNode> a = new TreeIterator();
        while (a.hasNext()) {
            TreeNode current = a.next();
            if (alreadySeen.contains(current)) {
                throw new IllegalStateException("already seen");
            } else {
                alreadySeen.add(current);
            }
        }
    }


    private TreeNode fibTreee (int a) {
        if (a == 0) {
            return new TreeNode(new Integer(0));
        }
        if (a == 1) {
            return new TreeNode(new Integer(1));
        }
        
        Integer x = (Integer) fibTreee(a-1).item;
        Integer y = (Integer) fibTreee(a-2).item;

        result = new TreeNode(x.intValue() + y.intValue(), fibTreee(a-1), fibTreee(n-2));
        return result; 
    }

    public static BinaryTree fibTree(int n) {
    BinaryTree result = new BinaryTree();
    result.root = result.fibTreee(n);
    return result;
}

public static BinaryTree exprTree(String s) {
    BinaryTree result = new BinaryTree();
    result.root = result.exprTreeHelper(s);
    return result;
}


// Contains nodes already seen in the traversal. 
private ArrayList alreadySeen; 

    public static void main(String[] args) {
        BinaryTree t;
        t = new BinaryTree();
        print(t, "the empty tree");
        t.fillSampleTree1();
        print(t, "sample tree 1");
        t.fillSampleTree2();
        print(t, "sample tree 2");
    }

    private static void print(BinaryTree t, String description) {
        System.out.println(description + " in preorder");
        t.printPreorder();
        System.out.println(description + " in inorder");
        t.printInorder();
        System.out.println();
    }

    public static class TreeNode {

        public Object item;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(Object obj) {
            item = obj;
            left = right = null;
        }

        public TreeNode(Object obj, TreeNode left, TreeNode right) {
            item = obj;
            this.left = left;
            this.right = right;
        }

        private void printPreorder() {
            System.out.print(item + " ");
            if (left != null) {
                left.printPreorder();
            }
            if (right != null) {
                right.printPreorder();
            }
        }

        private void printInorder() {
            if (left != null) {
                left.printInorder();
            }
            System.out.print(item + " ");
            if (right != null) {
                right.printInorder();
            }
        }
    }

// Contains nodes already seen in the traversal. 
private ArrayList alreadySeen;  
        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        public Object getItem() {
            return item;
        }
}
