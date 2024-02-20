/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainswagon;

import java.util.Stack;

/**
 *
 * @author arets
 */
public class MyStack<Train> implements StackInterface<Train> {
    
    private java.util.Stack<Train> stack;

    public MyStack() {
        stack = new Stack<>();
    }

     @Override
    public void push(Train item) {
        stack.push(item);
    }

    @Override
    public Train pop() {
        if (!isEmpty()) {
            return stack.pop();
        } else {
            return null; // Or throw an exception for an empty stack
        }
    }
     
    @Override
    public int size(){
      return stack.size();
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    @Override
    public void emptyStack() {
        stack.clear();
    }

    @Override
    public String displayStack() {
        StringBuilder result = new StringBuilder();
        for (Train item : stack) {
            result.append(item.toString()).append("\n");
        }
        return result.toString();
    }
}

