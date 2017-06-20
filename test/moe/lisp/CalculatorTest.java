/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author koide
 */
public class CalculatorTest {

    @Test
    public void TestMultiply01() {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }
    
    /* 課題1a */
    /**
     * 概要：引数の一方が正数、他方が負数の場合のテスト<br/>
     * 対象：multiply(int, int)<br/>
     * 条件：引数-10, 20<br/>
     * 期待する結果：戻り値 -200<br/>
     */
    @Test
    public void TestMultiply02(){
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }
    /**
     * 概要：引数の一方が0、他方が負数の場合のテスト<br/>
     * 対象：multiply(int, int)<br/>
     * 条件：引数0, -20<br/>
     * 期待する結果：戻り値 0<br/>
     */
    @Test
    public void TestMultiply03(){
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    
    
    /* 課題1b */
    /**
     * 概要：大きい順にc,b,aである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数10, 20, 30<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax01(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(10, 20, 30));
    }
    /**
     * 概要：大きい順にa,b,cである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数30, 20, 10<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax02(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(30, 20, 10));
    }
    /**
     * 概要：大きい順にb,a,cである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 30, 10<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax03(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(20, 30, 10));
    } 
    
    
    /* 課題1c */
    // a,b,cの大小の組み合わせは全部で13通り。1bで足りないものを全て以下に記述する。
    /**
     * 概要：大きい順にc,a,bである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 10, 30<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax04(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(20, 10, 30));
    }
    /**
     * 概要：大きい順にb,c,aである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数10, 30, 20<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax05(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(10, 30, 20));
    }
    /**
     * 概要：大きい順にa,c,bである場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数30, 10, 20<br/>
     * 期待する結果：戻り値30<br/>
     */   
    @Test 
    public void TestMax06(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(30, 10, 20));
    }
    /**
     * 概要：a,bが等しくcより小さい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 20, 30<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax07(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(20, 20, 30));
    }
    /**
     * 概要：a,bが等しくcより大きい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 20, 10<br/>
     * 期待する結果：戻り値20<br/>
     */
    @Test 
    public void TestMax08(){
        Calculator calc = new Calculator();
        int expected = 20;
        assertEquals(expected, calc.max(20, 20, 10));
    }
    /**
     * 概要：a,cが等しくbより小さい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 30, 20<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax09(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(20, 30, 20));
    }
    /**
     * 概要：a,cが等しくbより大きい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数20, 10, 20<br/>
     * 期待する結果：戻り値20<br/>
     */
    @Test 
    public void TestMax10(){
        Calculator calc = new Calculator();
        int expected = 20;
        assertEquals(expected, calc.max(20, 10, 20));
    }
    /**
     * 概要：b,cが等しくaより小さい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数30, 20, 20<br/>
     * 期待する結果：戻り値30<br/>
     */
    @Test 
    public void TestMax11(){
        Calculator calc = new Calculator();
        int expected = 30;
        assertEquals(expected, calc.max(30, 20, 20));
    }
    /**
     * 概要：b,cが等しくaより大きい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数10, 20, 20<br/>
     * 期待する結果：戻り値20<br/>
     */
    @Test 
    public void TestMax12(){
        Calculator calc = new Calculator();
        int expected = 20;
        assertEquals(expected, calc.max(10, 20, 20));
    }
    /**
     * 概要：a,b,cが等しい場合のテスト<br/>
     * 対象：max(int, int, int)<br/>
     * 条件：引数10, 10, 10<br/>
     * 期待する結果：戻り値10<br/>
     */
    @Test 
    public void TestMax13(){
        Calculator calc = new Calculator();
        int expected = 10;
        assertEquals(expected, calc.max(10, 10, 10));
    }
    
}
