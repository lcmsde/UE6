import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaerbaumTest {

    Binaerbaum<Integer> baum1 = new Binaerbaum<>();
    Binaerbaum<Integer> baum2 = new Binaerbaum<>();
    Binaerbaum<Integer> baum3 = new Binaerbaum<>();
    Binaerbaum<Integer> baum4 = new Binaerbaum<>();
    Binaerbaum<Integer> baum5 = new Binaerbaum<>();




    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void hoehe() {
        baum3 = new Binaerbaum<Integer>(7, null, null);
        baum4 = new Binaerbaum<Integer>(9, null,null);
        baum2 = new Binaerbaum<Integer>(5,baum4,null);
        baum1 = new Binaerbaum<Integer>(3,baum2,baum3);
        assertEquals(baum1.hoehe(),3);
    }

    @Test
    void size() {
        baum3 = new Binaerbaum<Integer>(7, null, null);
        baum4 = new Binaerbaum<Integer>(9, null,null);
        baum2 = new Binaerbaum<Integer>(5,baum4,null);
        baum1 = new Binaerbaum<Integer>(3,baum2,baum3);
        assertEquals(baum1.size(),4);
    }

    @Test
    void testToString() {
        baum3 = new Binaerbaum<Integer>(7, null, null);
        baum4 = new Binaerbaum<Integer>(9, null,null);
        baum5 = new Binaerbaum<Integer>(11,null,null);
        baum2 = new Binaerbaum<Integer>(5,baum4,baum5);
        baum1 = new Binaerbaum<Integer>(3,baum2,baum3);
        assertEquals(baum1.toString(),"(((9)5(11))3(7))");
        baum1.preorder();
        baum1.inorder();
        baum1.postorder();
    }
}