/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trainswagon;

/**
 *
 * @author arets
 */
public interface StackInterface <Train> {
    public void push (Train item);
    public Train pop ();
    public boolean isEmpty();
    public int size();
    public void emptyStack();
    public String displayStack();
}
