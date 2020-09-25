#include<stdio.h>
char name[50][50];
int choice;
int choice_new;
int c_IOT=0;
int c_advanced_and_j2=0;
int c_advanced_data_structures=0;
int n;
void read()
{
printf("Enter the number of students\n");
scanf("%d",&n);
for(int i=0;i<n;i++)
{
printf("Enter the name of student %d\n",(i+1));
scanf("%s",name[i]);
}
}
int main()
{
read();
printf("1:Internet Of Things\n2:Advanced Java And J2EE\n3:Advanced DataStructures\n");
for(int i=0;i<n;i++)
{
printf("Enter the choice of student %s\n",name[i]);
scanf(" %d",&choice);
read:
switch(choice)
{
case 1:
printf("student %s applied for internet of things  \n",name[i]);
c_IOT++;
break;
case 2:
printf("student %s appllied for advanced java and J2EEE  \n",name[i]);
c_advanced_and_j2++;
break;
case 3:
printf("student %s has applied for Advanced data structures \n",name[i]);
c_advanced_data_structures++;
break;
}
}
printf("Number of students applied for Internet of things is %d \n",c_IOT);
printf("Number of students applied for advanced java and J2EEE is %d \n",c_advanced_and_j2);
printf("Number of students applied for data structures is %d\n",c_advanced_data_structures);
for(;;)
{
if(c_IOT<=30)
{
printf("This Course cannot be floated please select the other from the other two course\n");
printf("2:Advanced Java And J2EE\n3:Advanced DataStructures\n");
scanf(" %d",&choice_new);
break;
}
if(c_advanced_and_j2<=30)
{
printf("This Course cannot be floated please select the other course\n");
printf("1:Internet Of Things\n3:Data structures\n");
scanf(" %d",&choice_new);
break;
}
if(c_advanced_data_structures<=30)
{
printf("This Course cannot be floated please select the other course\n");
printf("1:Internet Of Things\n2:Advanced java and j2eee\n");
scanf(" %d",&choice_new);
break;
}
break;
}
switch(choice_new)
{
case 1:
c_IOT++;
break;
case 2:
c_advanced_and_j2++;
break;
case 3:
c_advanced_data_structures++;
break;
}
printf("*****************After modification******************\n");
printf("Number of students applied for Internet of things is %d \n",c_IOT);
printf("Number of students applied for advanced java and J2EEE is %d \n",c_advanced_and_j2);
printf("Number of students applied for data structures is %d\n",c_advanced_data_structures);
}

