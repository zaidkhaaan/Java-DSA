//package LinkedList;
//
// class  stack{
//     int [] arr;
//     int top;
//     int capacity;
//
//     stack(int size){
//         arr = new int [size];
//         capacity = size;
//         top = -1;
//
//     }
//
//     void push (int x){
//         if (ifFull){
//             System.out.println("overflow");
//             return;
//         }
//         arr[++top] = x;
//         System.out.println("Pushed"+x);
//
//     }
//
//     int pop() {
//         if (ifEmpty){
//             System.out.println("underflow");
//         }
//         return arr[top--];
//     }
//
//     int peek(){
//         if (ifEmpty){
//             System.out.println("stack empty");
//             return -1;
//         }
//         return arr[top];
//     }
//     boolean ifEmpty() {
//         return top ==-1;
//     }
//
//     boolean ifFull(){
//         return  top == capacity-1;
//     }
//
//     int size () {
//         return top +1;
//     }
// }