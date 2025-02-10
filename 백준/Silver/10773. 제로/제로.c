#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int list[100000];
int top = -1;

void push(int data)
{
    top++;
    list[top] = data;
}

void pop()
{
    list[top] = 0;
    top--;
}

int main()
{
    int k, i, data;

    scanf("%d", &k);

    for (int i = 0; i < k; i++)
    {
        scanf("%d", &data);
        
        if (data == 0)
        {
            pop();
        }
        else
        {
            push(data);
        }
    }

    int sum = 0;

    for (int i = 0; i < sizeof(list) / sizeof(list[0]); i++)
    {
        sum += list[i];
    }

    printf("%d", sum);

    return 0;
}