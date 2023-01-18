package com.sparta.mi;

import com.sparta.mi.sorters.BinarySorter;
import com.sparta.mi.exceptions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTester {

        @Test
        @DisplayName("This tests getRootElement")
        public void shouldGetRootElement() {
            BinarySorter bt = new BinarySorter(5);
            Assertions.assertEquals(5, bt.getRootElement());
        }

        @Test
        @DisplayName("This tests getting number of elements for single element")
        public void shouldReturnOne() {
            BinarySorter bt = new BinarySorter(5);
            Assertions.assertEquals(1, bt.getNumberOfElements(bt.findNode(5)));
        }

        @Test
        @DisplayName("This tests getting number of elements for multiple elements")
        public void shouldReturnFour() {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{2, 8, 3});
            Assertions.assertEquals(3, bt.getNumberOfElements(bt.findNode(5)));
        }

        @Test
        @DisplayName("This tests getting number of elements for multiple elements with duplicates")
        public void shouldReturnThree() {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{2, 3, 3});
            Assertions.assertEquals(3, bt.getNumberOfElements(bt.findNode(5)));
        }

        @Test
        @DisplayName("This tests adding a node")
        public void shouldAddNode() throws ChildNotFoundException {
            BinarySorter bt = new BinarySorter(5);
            bt.addElement(4);
            bt.addElement(10);
            Assertions.assertEquals(3, bt.getNumberOfElements(bt.findNode(5)));
            Assertions.assertEquals(4, bt.getLeftChild(5));
        }

        @Test
        @DisplayName("This tests finding a value that exists")
        public void shouldFindValueAndReturnTrue() {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{2, 8, 3});
            assertTrue(bt.findElement(8));
        }

        @Test
        @DisplayName("This tests finding a value that doesn't exist")
        public void shouldNotFindValueAndReturnFalse() {
            BinarySorter bt = new BinarySorter(5);
            bt.addElement(4);
            bt.addElement(10);
            Assertions.assertFalse(bt.findElement(12));
        }

        @Test
        @DisplayName("This test get left child of root")
        public void shouldFindLeftChild() throws ChildNotFoundException {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{2, 8, 3});
            Assertions.assertEquals(3, bt.getLeftChild(5));
        }

        @Test
        @DisplayName("This test get left child of of child element")
        public void shouldFindLeftChildOfChild() throws ChildNotFoundException {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{2, 1, 8, 3});
            Assertions.assertEquals(1, bt.getLeftChild(5));
        }

        @Test
        @DisplayName("This test get right child of of child element")
        public void shouldFindRightChildOfChild() throws ChildNotFoundException {
            BinarySorter bt = new BinarySorter(5);
            bt.addElements(new int[]{15, 4, 17, 30, 23, 35, 32, 50});
            Assertions.assertEquals(35, bt.getRightChild(30));
        }

}
