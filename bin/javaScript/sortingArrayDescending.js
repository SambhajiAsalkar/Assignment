function bubbleSortDescending(array) {
    const n = array.length;
    let swap;
    do {
        swap = false;
        for (let i = 0; i < n - 1; i++) 
        {
            if (array[i] < array[i + 1]) 
            {                             				                          
                const temp = array[i];           //[10, 6, 3, 0, 1, 5];  //1st time [10, 6, 3, 0, 5,1]
                array[i] = array[i + 1];         // 0  1  2  3  4  5 
                array[i + 1] = temp;
                swap = true;
            }
        }
        
    } while (swap);
}

const numbers = [10, 6, 3, 0, 1, 5];
bubbleSortDescending(numbers);

console.log(numbers);                   // Output: [ 10, 6, 5, 3, 1, 0 ]
