function merge_sorted_lists(array1, array2) {
    const merged_list = [];
    let indexOne = 0;
    let indexTwo = 0;

    while (indexOne < array1.length && indexTwo < array2.length) {
        if (array1[indexOne] < array2[indexTwo]) {
            merged_list.push(array1[indexOne]);
            indexOne++;
        } else {
            merged_list.push(array2[indexTwo]);
            indexTwo++;
        }
    }
    while (indexOne < array1.length) {
        merged_list.push(array1[indexOne]);
        indexOne++;
    }
    while (indexTwo < array2.length) {
        merged_list.push(array2[indexTwo]);
        indexTwo++;
    }
    return merged_list;
}

const first_list = [1,3,4,5];
const second_list = [2,6,7,8]
console.log(merge_sorted_lists(first_list, second_list));