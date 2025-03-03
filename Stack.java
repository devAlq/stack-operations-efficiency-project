class Stack{
    public Node peek;  
    int size;

    public Stack () {
        peek = null;
        size = 0;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = peek;
        peek = newNode;
        this.size += 1;
    }

    public char pop() {

            if (isEmpty()) {
    
                System.out.println("Stack is empty.");
    
                return ' ';
    
            }
    
            char popped = peek.data;
    
            peek = peek.next;
            this.size-=1;
    
            return popped;
    
        }

    

    public char peek() {
        if (isEmpty()){
            System.out.println("stack is empty");
            return ' ';
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
    public char data;
    public Node(char data){
        this.next = null;
        this.data=data;
    } 
}