package ch02.ex01_Sort;

public class InsertionSort implements MySort { // 삽입 정렬

	@Override
	public void sort(int[] arr) { // {2,5,3,4} [0][1][2][3]
		int n = arr.length;
		
		for (int i=1; i<n; ++i) {
			int key = arr[i]; // 삽입할 위치를 찾아줄 데이터
			int j = i-1; 	  // 0 ~ j 정렬된 서브 리스트
			
			while (j>=0 && arr[j]>key) { // arr[i-1] > arr[i]
				// key 값보다 정렬된 배열에 있는 값이 크면
				arr[j+1] = arr[j]; // 데이터를 한칸씩 오른쪽으로 이동
				j = j - 1; // 역순으로 값 비교
			}
			arr[j+1] = key;
		}
	} 
}

// key: arr[1]
// j=0
// arr[1] = arr[1]

// key: arr[2]
// j=1
// arr[2] = arr[1] = 3  
// j = 0
// arr[0]>arr[2]   
// arr[1] = arr[2]  
