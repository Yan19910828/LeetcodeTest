package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
//		Integer[] arr1 = { 1, 2, 3, 4 };
//		Integer[] arr2 = { 1, 2, 3, 1 };
//		System.out.println(isDue(arr1));
//		System.out.println(isDue(arr2));

//		Integer[] arr1 = { 2, 2, 1 };
//		Integer[] arr2 = { 4, 1, 2, 1, 2 };
//		System.out.println(getOne(arr1));
//		System.out.println(getOne(arr2));
//
//		int[] arr3 = { 2, 2, 1 };
//		int[] arr4 = { 4, 1, 2, 1, 2 };
//		System.out.println(getOne3(arr3));
//		System.out.println(getOne3(arr4));
		int[] arr5 = { 1, 2, 2, 1 };
		int[] arr6 = { 2, 1 };
		System.err.println(Arrays.toString(intersection(arr5, arr6)));
	}

	public static boolean isDue(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		return list.size() == arr.length;
	}

	public static int getOne(Integer[] arr) {

		List<Integer> list = Arrays.asList(arr).stream().filter(i -> Collections.frequency(Arrays.asList(arr), i) == 1)
				.collect(Collectors.toList());
		System.out.println(list);
		return list.get(0);
	}

	public static int getOne2(int[] arr) {

		Integer[] iarr = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			iarr[i] = arr[i];
		}
		int[] a = Arrays.stream(arr).filter(i -> Collections.frequency(Arrays.asList(arr), i) == 1).toArray();

		return a[0];
	}

	public static int getOne3(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {

				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int res = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				res = entry.getKey();
			}
		}

		return res;
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++) {
			if (!map.containsKey(nums1[i])) {
				map.put(nums1[i], 1);
			}
		}
//		System.out.println(map);
		for (int i = 0; i < nums2.length; i++)
			if (map.containsKey(nums2[i])) {
				map.put(nums2[i], map.get(nums2[i]) + 1);
			} else {
				map.put(nums2[i], 1);
			}

//		System.out.println(map);
		List<Integer> list = new ArrayList<>();

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

}
