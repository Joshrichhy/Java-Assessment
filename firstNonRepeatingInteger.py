num = [4, 5, 1, 2, 0, 4]


def first_non_repeating_integer(number):
    for i in range(0, len(number), 1):
        for j in range(i + 1, len(number), 1):
            if number[i] != number[j] and j == len(number)-1:
                return number[i]

    return 0


print(first_non_repeating_integer(num))
