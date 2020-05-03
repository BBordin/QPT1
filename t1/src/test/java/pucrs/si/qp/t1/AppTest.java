package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testInvalido()
    {
        int actual = App.identificaTriangulo(6, 6, -7);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testVariantes3()
    {
        int actual = App.identificaTriangulo(6,7,6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testVariantes32()
    {
        int actual = App.identificaTriangulo(7,6,6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testNegativo()
    {
        int actual = App.identificaTriangulo(2,3,-4);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testLinha()
    {
        int actual = App.identificaTriangulo(1,2,3);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }
	
	@Test
    public void testVairantes7()
    {
        int actual = App.identificaTriangulo(1,3,2);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }
	
	@Test
    public void testVairantes72()
    {
        int actual = App.identificaTriangulo(3,1,2);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }
	
	@Test
    public void testLinhaLonga()
    {
        int actual = App.identificaTriangulo(1,2,8);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }
	
	@Test
    public void testVairantes9()
    {
        int actual = App.identificaTriangulo(8,1,2);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }
	
	@Test
    public void testZEROS()
    {
        int actual = App.identificaTriangulo(0,0,0);
        int expected = tipos.INEXISTENTE.value(); 
        assertEquals(expected, actual);
    }

}





