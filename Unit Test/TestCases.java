package org.jfree.data.test;
import org.jfree.data.Range;

import org.jfree.data.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCases {
Range range=new Range(2,6);
    @Test
       public void Get_Lower(){
          Range range= new Range(0.5,6);
         Assertions.assertEquals(0.5,range.getLowerBound());
       }


    @Test
    public void Get_upper(){
        Range range= new Range(1,6.9);
        Assertions.assertEquals(6.9, range.getUpperBound());
    }

    @Test
    public void Get_len(){
        Range range= new Range(96,150);
        Assertions.assertEquals(54, range.getLength());
    }

    @Test
    public void Get_centeral(){
        Range range= new Range(1,6);
        Assertions.assertEquals(3.5, range.getCentralValue());
    }
    @Test
    public void Contain(){
        Range range= new Range(1,6);

        Assertions.assertTrue( range.contains(1));
    }
    @Test
    public void constrain(){
        Range range= new Range(1,6);
        Assertions.assertEquals(2, range.constrain(2));
    }


    @Test
    public void intersects(){
        Range range= new Range(6,10);
        Assertions.assertTrue( range.intersects(1,4));
    }

    @Test
    public void combine(){
        Range range= new Range(1,6);
        Range range_2=new Range(7 , 10);
        Range result=new Range(1,10);
        Assertions.assertEquals( result, Range.combine(range,range_2));

    }

    @Test
    public void expandToInclude(){
        Range range= new Range(1,6);
        Range result=new Range(1,7);

        Assertions.assertEquals( result, Range.expandToInclude(range,7));

    }
    @Test
    public void expand(){
        Range range= new Range(2,6);
        Range result=new Range(1,8);

     //   Assertions.assertEquals( result, Range.expand(range,0.25,0.5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Range.expand(null,0.25,0.5));
    }
    @Test
    public void shift(){
        Range range= new Range(2,6);
        Range result=new Range(4,8);

       // Assertions.assertEquals(result, Range.shift(range,2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Range.shift(null,0.25));
    }

    @Test
    public void shift_2(){
        Range range= new Range(-2,6);
        Range result=new Range(0,8);

        Assertions.assertEquals(result, Range.shift(range,2,true));

    }

}
