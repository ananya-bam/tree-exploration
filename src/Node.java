public interface Node<Key extends Comparable<Key>, Value>{
    // int value;
    // Node left;
    // Node right;
    
    // public Node (int value) {
    //     this.value = value;
    // }
    
    public Value getValue();

    public Node getLeft();

    public Node getRight();
}
