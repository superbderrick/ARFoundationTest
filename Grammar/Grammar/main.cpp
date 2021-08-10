//
//  main.cpp
//  Grammar
//
//  Created by derrick on 2021/08/10.
//

#include <iostream>
#include <string.h>

struct Employee
{
    int number;
    char name[80];
    long pay;
};

struct Company
{
    struct Employee kim;
    struct Employee seo;
    struct Employee lee;
    char hoisa[80];
};

int main(int argc, const char * argv[]) {
    
    struct Company cyber;
    
    cyber.kim.number = 123;
    strcpy(cyber.kim.name, "Kimjin");
    cyber.kim.pay = 200;
    
    cyber.lee.number = 123;
    strcpy(cyber.lee.name, "LEEjin");
    cyber.kim.pay = 200;
    
    cyber.seo.number = 123;
    strcpy(cyber.seo.name, "Seojin");
    cyber.seo.pay = 200;
    
    
    std::cout << cyber.kim.name << "\n";
    
    
    
    return 0;
}

