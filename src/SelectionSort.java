class SelectionSort
{
// Selection Sort Method
void sort(int array[]) {
    int n = array.length;
    for (int i = 0; i < n-1; i++) {
        int min_element = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_element])
                    min_element = j;
                    int temp = array[min_element];
                    array[min_element] = array[i];
                    array[i] = temp;
        }
    }
}