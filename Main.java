class Main{
    public static void main(String[] args) {

       Stack stack = new Stack();
       System.out.println(stack.isEmpty());
       stack.push("Khalid");
       stack.push("mohamed");
       stack.push("sari");
       System.out.println("The size of the stack: " + stack.size());
       System.out.println("The top of the stack: " + stack.peek());
       System.out.println("The size of the stack: " + stack.pop());
       System.out.println("The top of the stack: " + stack.peek());
       System.out.println(stack.isEmpty());



      



   }
}