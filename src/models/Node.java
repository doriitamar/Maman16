public class Node {

    private int key;
    private String value;

    private ThreadedTree left;
    private ThreadedTree right;
    private ThreadedTree parent;

    public Node(key, value, parent) {
        this.key = key;
        this.value = value;
        this.parent = parent;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public ThreadedTree getLeft() {
        return left;
    }

    public ThreadedTree getRight() {
        return right;
    }

    protected void setLeft(ThreadedTree left) {
        this.left = left;
    }

    protected void setRight(ThreadedTree right) {
        this.right = right
    }

    protected ThreadedTree getParent() {
        return parent;
    }

    protected void setParent(ThreadedTree parent) {
        this.parent = parent;
    }
}
