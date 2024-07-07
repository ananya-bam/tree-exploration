public class Tester {
    public static void main(String[] args) {
        
        System.out.println("BST TESTS: ");
        TreeInterface<Integer, Integer> binarySearchTree = new BSTPrinceton<>();
        binarySearchTree.insert(1, 8);
        binarySearchTree.insert(5, 400);
        binarySearchTree.insert(10, 2);

        System.out.println("checking insert, should return true: " + checkIfEqual(binarySearchTree.get(1), 8));
        System.out.println("checking insert, should return true: " + checkIfEqual(binarySearchTree.get(5), 400));
        System.out.println("checking insert, should return false: " + checkIfEqual(binarySearchTree.get(10), 3));
        
        binarySearchTree.remove(5);

        System.out.println("checking remove, should return true: " + checkIfEqual(binarySearchTree.get(5), null));

        System.out.println("checking size, should return true: " + checkIfEqual(binarySearchTree.size(), 2));

        System.out.println("printing tree: ");
        System.out.println(binarySearchTree);

        System.out.println("\nAVL TESTS: ");
        TreeInterface<Integer, Integer> avlTree = new AVLPrinceton<>();
        avlTree.insert(1, 8);
        avlTree.insert(5, 400);
        avlTree.insert(10, 2);

        System.out.println("checking insert, should return true: " + checkIfEqual(avlTree.get(1), 8));
        System.out.println("checking insert, should return true: " + checkIfEqual(avlTree.get(5), 400));
        System.out.println("checking insert, should return false: " + checkIfEqual(avlTree.get(10), 3));

        avlTree.remove(5);

        System.out.println("checking remove, should return true: " + checkIfEqual(avlTree.get(5), null));

        System.out.println("checking size, should return true: " + checkIfEqual(avlTree.size(), 2));


        System.out.println("\nRED-BLACK TESTS: ");
        TreeInterface<Integer, Integer> redBlack = new RedBlackTree<>();
        redBlack.insert(1, null);
        redBlack.insert(5, null);
        redBlack.insert(10, null);

        System.out.println("checking insert, should return true: " + checkIfEqual(redBlack.get(1), 1));
        System.out.println("checking insert, should return true: " + checkIfEqual(redBlack.get(5), 5));
        System.out.println("checking insert, should return false: " + checkIfEqual(redBlack.get(10), 3));

        redBlack.remove(5);

        System.out.println("checking remove, should return true: " + checkIfEqual(redBlack.get(5), null));

        System.out.println("checking size, should return true: " + checkIfEqual(redBlack.size(), 2));

        System.out.println("printing tree: ");
        System.out.println(redBlack);

        System.out.println("\nSPLAY TESTS: ");
        TreeInterface<Integer, Integer> splayTree = new SplayTree<>();
        splayTree.insert(1, 8);
        splayTree.insert(5, 400);
        splayTree.insert(10, 2);

        System.out.println("checking insert, should return true: " + checkIfEqual(splayTree.get(1), 8));
        System.out.println("checking insert, should return true: " + checkIfEqual(splayTree.get(5), 400));
        System.out.println("checking insert, should return false: " + checkIfEqual(splayTree.get(10), 3));

        splayTree.remove(5);

        System.out.println("checking remove, should return true: " + checkIfEqual(splayTree.get(5), null));

        System.out.println("checking size, should return true: " + checkIfEqual(splayTree.size(), 2));

        System.out.println("printing tree: ");
        System.out.println(splayTree);

        System.out.println("\nSKIP LIST TESTS: ");
        TreeInterface<Integer, Integer> skipList = new SkipList<>();
        skipList.insert(1, 8);
        skipList.insert(5, 400);
        skipList.insert(10, 2);

        System.out.println("checking insert, should return true: " + checkIfEqual(skipList.get(1), 8));
        System.out.println("checking insert, should return true: " + checkIfEqual(skipList.get(5), 400));
        System.out.println("checking insert, should return false: " + checkIfEqual(skipList.get(10), 3));

        skipList.remove(5);

        System.out.println("checking remove, should return true: " + checkIfEqual(skipList.get(5), null));

        System.out.println("checking size, should return true: " + checkIfEqual(skipList.size(), 2));
    }

    public static boolean checkIfEqual(Object a, Object b) {
        if (a == null) {
            if (b == null)
                return true;
            return false;
        }
        if (b == null) {
            if(a == null)
                return true;
            return false;
        }
        if (a.equals(b)) {
            return true;
        }
        return false;
    }
}
