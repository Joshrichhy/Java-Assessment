def calculate_numbers_divisible_by_three(number):
    sum = 0
    for num in range(1, number, 1):
        if num % 3 == 0:
            sum += num

    print(sum)


calculate_numbers_divisible_by_three(30)


