package iyte.edu.year2019.ceng437.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

	InsertionSort insertionSort;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		insertionSort = new InsertionSort();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//Test for SCPath1, I used the input datas which I calculate in question 5.
	@Test
	void testSCPath1() {
		
		int[] arr = {15};
		
		int n = 1;
	
		int[] expectedOutput = {15};
		
		assertArrayEquals(expectedOutput, insertionSort.doInsertionSort(arr, n));
	}
	
	//Test for SCPath2, I used the input datas which I calculate in question 5.
	@Test
	void testSCPath2() {
		
		int[] arr = {100, 30};
		
		int n = 2;	
		
		int[] expectedOutput = {30, 100};

		assertArrayEquals(expectedOutput, insertionSort.doInsertionSort(arr, n));
	}
	
	//Test for BCPath1, I used the input datas which I calculate in question 5.
	@Test
	void testBCPath1() {
		
		int[] arr = {65, 110};
		
		int n = 2;	
		
		int[] expectedOutput = {65, 110};

		assertArrayEquals(expectedOutput, insertionSort.doInsertionSort(arr, n));
	}

}
