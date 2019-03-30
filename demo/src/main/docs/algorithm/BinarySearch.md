package algorithm;

/**
 * 二分查找
 * not smart coder
 */
public class BinarySearch {
    public static void main(String args[]){
        int[] array = new int[]{1,2,3,4,5,7,9,9,10,11,12,13};
        int targetKey = 9;
        int targetKeyIndex = BinarySearch.binarySearch(array, targetKey);
        System.out.println(targetKeyIndex);
    }

    /**
     * 二分查找
     * @param array 有序数组
     * @param targetKey 查找目标值
     * @return 数组坐标，未找到返回-1
     */
    public static int binarySearch(int[] array, int targetKey){
        int keyIndex = array.length / 2;
        if (targetKey == array[keyIndex]) {
            return keyIndex;
        }
        if (targetKey == array[0]) {
            return 0;
        }
        if (targetKey == array[array.length - 1]) {
            return array.length - 1;
        }
        // 数组头坐标
        int head = 0;
        // 数组尾坐标
        int tail = array.length - 1;
        while(head <= tail){
            // 关键点，取二分中心点
            int mid = (tail - head) / 2 + head;
            if (targetKey < array[mid]) {
                tail = mid - 1;
            } else if ( targetKey > array[mid]) {
                head = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
