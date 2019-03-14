/**
 *
 */
package leetcode;

/**
 * @author cc
 * 
 */
public class ContainerWithMostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] height = { 1, 2, 5, 4, 3, 2, 6, 1, 2, 5, 1, 2, 1, 4, 1, 3, 1, 1 };
		System.out.println(new ContainerWithMostWater().maxArea(height));
	}

	public int maxArea(int[] height) {
		int max = 0;
		int left = 0;
		int right = height.length - 1;
		int h = 0;
		int w = 0;
		int area = 0;
		while (left < right) {
			w = right - left;
			if (height[left] < height[right]) {
				h = height[left];
				left++;
			} else {
				h = height[right];
				right--;
			}
			area = w * h;
			if (area > max) {
				max = area;
			}
		}
		return max;
	}

}
