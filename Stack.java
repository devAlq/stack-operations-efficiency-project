class Stack{
    public Node peek;  
    int size;

    public Stack () {
        peek = null;
        size = 0;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = peek;
        peek = newNode;
        this.size += 1;
    }

    public String pop() {

            if (isEmpty()) {
    
                System.out.println("Stack is empty.");
    
                return null;
    
            }
    
            String popped = peek.data;
    
            peek = peek.next;
            this.size-=1;
    
            return popped;
    
        }

    

    public String peek() {
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        return peek.data;
    }

    public boolean isEmpty() {
        return peek == null;
    }

    public int size() {
        return size;
        
    }
}
class Node{
    public Node next;
    public String data;
    public Node(String data){
        this.next = null;
        this.data=data;
    } 
}