#!/bin/python3

import sys


def minimumLoss(price):
    # Complete this function
    min_price = 10000000
    price_sorted = sorted(price, reverse=True)
    # for i in range(len(price)):
    #     for j in range(i+1, len(price)):
    #         if (price[i] >= price[j]) and ((price[i]-price[j]) < min_price):
    #             min_price = price[i]-price[j]
    loss = []
    for i in range(len(price_sorted)-1):
        loss.append(price_sorted[i]-price_sorted[i+1])
    # print(sorted(loss, reverse=True))
    for i in range(len(loss)):
        idx_first = price.index(price_sorted[i])
        idx = price.index(price_sorted[i+1])
        if (idx > idx_first) and (loss[i] < min_price):
            # print(price_sorted[i], price_sorted[i+1], loss[i])
            min_price = loss[i]
    return min_price


if __name__ == "__main__":
    # n = int(input().strip())
    # price = list(map(int, input().strip().split(' ')))
    price = [20, 7, 8, 2, 5]

    result = minimumLoss(price)
    print(result)
