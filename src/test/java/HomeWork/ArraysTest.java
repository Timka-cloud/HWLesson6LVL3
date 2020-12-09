package HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArraysTest {
    private Arrays arr;

//    @BeforeEach
//    public void init() {
//        arr = new Arrays();
//    }


    @Test
    void shouldCreateNewArrayAfterLast4(){
        Assertions.assertArrayEquals(new int[]{3},Arrays.createNewArrayAfterLast4(new int[]{5, 6, 3, 4, 3}));
        Assertions.assertArrayEquals(new int[]{7,8,9},Arrays.createNewArrayAfterLast4(new int[]{5, 6, 3, 4, 3,5,4,7,8,9}));
        Assertions.assertArrayEquals(new int[]{6,8,9}, Arrays.createNewArrayAfterLast4(new int[]{5,4,6,8,9}));

    }

    //    @ParameterizedTest
//    @CsvSource({
//        "true,{5,6,4,3}", // так что то не работает, так можно вообще делать?
//
//
//    })
//    void haveToCheck1And4InArray(boolean expected, int[] actual){
//        Assertions.assertEquals(expected,Arrays.check1and4(actual));
//    }

    @Test
    void haveToCheck1And4InArray(){
        Assertions.assertTrue(Arrays.check1and4(new int[]{1, 6, 7, 4}));
        Assertions.assertFalse(Arrays.check1and4(new int[]{5, 6, 7, 8}));
        Assertions.assertTrue( Arrays.check1and4(new int[]{1, 6, 7, 8}));



    }

}
