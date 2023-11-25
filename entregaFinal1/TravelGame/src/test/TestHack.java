package test;

import junit.framework.TestCase;
import model.Control;

public class TestHack extends TestCase {

    private Control control;

    public void setUpStage1() throws Exception {
        control = new Control();
    }

    public void testFinishTripList() throws Exception {
        setUpStage1();
        control.getGrafo().addVertex("A",0);
        control.getGrafo().addVertex("B",1);
        control.getGrafo().addVertex("C",2);
        control.getGrafo().addVertex("D",3);

        control.getGrafo().addArista(0,2,3);
        control.getGrafo().addArista(0,1,7);
        control.getGrafo().addArista(2,3,8);
        control.getGrafo().addArista(2,1,2);
        control.getGrafo().addArista(1,3,2);

        assertEquals(control.proveFinish(1,0,2),"you can reach your destination" );
        assertEquals(control.proveFinish(1,1,2),"No, sorry you cant reach, you need back to another station " );
        assertEquals(control.proveFinish(1,3, 0),"No, sorry you cant reach, you need back to another station " );
    }
    public void testFinishTripMatrix() throws Exception {
        setUpStage1();
        control.getGrafoM().addVertex("A",0);
        control.getGrafoM().addVertex("B",1);
        control.getGrafoM().addVertex("C",2);
        control.getGrafoM().addVertex("D",3);

        control.getGrafoM().addEdge(0,2,3);
        control.getGrafoM().addEdge(0,1,7);
        control.getGrafoM().addEdge(2,3,8);
        control.getGrafoM().addEdge(2,1,2);
        control.getGrafoM().addEdge(1,3,2);

        assertEquals(control.proveFinish(2,0,2),"you can reach your destination" );
        assertEquals(control.proveFinish(2,1,2),"No, sorry you cant reach, you need back to another station " );
        assertEquals(control.proveFinish(2,3, 0),"No, sorry you cant reach, you need back to another station " );
    }

}
