#include<stdio.h>
#include<string.h>

typedef struct{
char showname[30];
char showtime[30];
char showdate[30];
}Show;
Show show;


typedef struct{
char name[30];
char ticketno[30];
}Seat;
Seat seat;

int main(){
    int choice;
    int i=0;
    printf("\n========== TICKET RESERVATION =============");
    printf("\n-------------------------------------------");
    printf("\n==========        MENU       ==============");
    printf("\n-------------------------------------------");
    printf("\n              1.BOOKING                    ");
    printf("\n              2.CANCEL                     ");
    printf("\n              3.RECORD                     ");
    printf("\n              4.EXIT                       ");
    printf("\n-------------------------------------------");
    printf("\n");

    printf("\nEnter your choice : ");
    scanf("%d",&choice);
    switch(choice){
    case 1:

        printf("\nEnter the customer name :");
        scanf("%s",seat.name);
        printf("\nEnter the seat no :");
        scanf("%d",seat.ticketno);

        printf("\nEnter the show : ");
        scanf("%s",show.showname);
        printf("\nEnter the Show date: ");
        scanf("%s",show.showdate);
        printf("\nEnter the show time : ");
        scanf("%s",show.showtime);

        printf("\n==================================");
        printf("\n------BOOKED SUCCESSFULLY-------");
        printf("\n");
        break;
    case 2:
        printf("\nEnter the Ticket No: ");
        scanf("%d",seat.ticketno);
        printf("\nEnter the Show Time : ");
        scanf("%s",show.showtime);

        printf("\n===================================");
        printf("\n------CANCELED SUCESSFULLY-------");
        break;
    case 3:
        for(i=0;i<2;i++){
        printf("\nEnter the Customer name : ");
        scanf("%s",seat.name);
        printf("\nEnter the Seat no: ");
        scanf("%d",seat.ticketno);
    }
    printf("\n========================================");
        for(i=0;i<2;i++){
            printf("\n Name : %s",seat.name);
            printf("\n Seat No: %d",seat.ticketno);
            printf("\n--------------------------------");
        }
        break;
    case 4:
        printf("=====Thanks for Using=====");
        break;
    default:
        printf("-----Wrong selection-------");
    }
    return 0;
}
