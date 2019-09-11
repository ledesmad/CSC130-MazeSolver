package csc130.data.arraystack;

public class Test {
  public static void main(String[] args) {
    StackADT<String> TestStack = new ArrayStack<String>();
    TestStack.push("dog");
    TestStack.push("cat");
    TestStack.push("walrus");
    TestStack.push("zebra");
    System.out.println(TestStack);
    System.out.println(TestStack.peek());
    System.out.println(TestStack.pop());
    System.out.println(TestStack);
    System.out.println(TestStack.size());
    System.out.println(TestStack.pop());
    System.out.println(TestStack.pop());
    System.out.println(TestStack.pop());
    System.out.println(TestStack.isEmpty());
  }
}
