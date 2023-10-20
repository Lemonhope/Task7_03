package Task7_03;

public class ModernUnidirectionalLinkedList<T> implements List<T>{
    private static class Element<T>{
        T data;
        Element<T> next;

        public Element() {
        }

        public Element(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
    private Element<T> head;
    private int size;

    public ModernUnidirectionalLinkedList() {
        this.size=0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(final T data) {
        // додавання в кінець списку
        this.size++;
        Element<T> n;
        if (this.head == null) {
            this.head = new Element<>(data);
            this.head.next = null;
        }
        else {
            n = head;
            while (n.next != null){
                n=n.next;
            }
            Element<T> newElement=new Element<>(data);
            newElement.next=null;
            n.next=newElement;
        }
    }

    @Override
    public void add(final int index, final T data) {
        Element<T> k = this.head;
        if((index<=0)||(index > size)) {
            System.out.println("Can't add element in list with said index!");
        }else{
            if(index==1){
                this.size++;
                this.head = new Element<>(data);
                this.head.next = k;
            }else {
                this.size++;
                for(int i=2; ((i<index)&&(k.next != null)); i++){
                    k = k.next;
                }
                Element<T> newElement=new Element<>(data);
                newElement.next=k.next;
                k.next=newElement;
            }
        }
    }

    @Override
    public void remove(T someData) {
        Element<T> k = this.head;
        if (this.head.getData() == someData) {
            this.head = k.next;
            size--;
        }
        else {
            while ((k.next != null)&&(k.next.getData() != someData))
                k = k.next;
            if(k.next==null){
                System.out.println("No such element in the list!");
            }else {
                size--;
                //System.out.println("delete");
                k.next = k.next.next;
            }
        }
    }

    @Override
    public void remove(int index) {
        Element<T> k = this.head;
        if((index<=0)||(index > size)) {
            System.out.println("No element in list with such index!");
        }
        else {
            size--;
            if (index == 1) {
                this.head = k.next;
            } else {
                for(int i=2; ((i<index)&&(k.next != null)); i++){
                    k = k.next;
                }
                if (k.next == null) {
                    System.out.println("No such element in the list!");
                } else {
                    k.next = k.next.next;
                }
            }
        }
    }

    @Override
    public void insertHead(T data) {
        add(1, data);
    }

    public void show(){
        Element<T> el=this.head;
        System.out.print("My list:  ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(el.getData()+"  ");
            el=el.next;
        }
        System.out.println();
    }
}
