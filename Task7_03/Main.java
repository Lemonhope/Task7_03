package Task7_03;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> myList=new ModernUnidirectionalLinkedList<>();
        myList.add("1");
        myList.add("3");
        myList.add("4");
        myList.add(2,"2");
        myList.show();
        System.out.println("Size of my list = "+myList.size());
        System.out.println("Deleting 3-d element:");
        myList.remove("3");
        myList.show();
        System.out.println("Deleting 4-th index element that doesn't exist now:");
        myList.remove(4);

    }
}
