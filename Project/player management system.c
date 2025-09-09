#include<stdio.h>
#include <stdlib.h>
#include<string.h>

typedef struct Player{
	int jersey_number;
	char name[20];
	int runs;
	int wickets;
	int matches_played;
	

}Player;

int count=11;
//function declarations
void addPlayer(Player**,int*,int*);
void removePlayer(Player[],int*);
void searchPlayer(Player[],int);
void updatePlayer(Player[],int);
void displaySortedPlayers(Player[],int);
void displayAllPlayers(Player[],int);
void displayTop3Players(Player[],int);
void playersinfo(Player[]);



int main()  //main start
{
	int choice;
	Player* players;
	int size;
	int totalSize = 11;
	printf("Enter Array Size :");
	scanf("%d",&size);
	totalSize=totalSize+size;

 players = (Player *)malloc(totalSize * sizeof(Player));
    if (players == NULL) {
        printf("Memory allocation failed:)\n");
        return 1;
    }
    playersinfo(players);

//do while loop
	do{
		printf("\n||============================||\n");
		printf("|| Player Management System   ||\n");
		printf("||============================||\n\n");
		
		printf("*********************************\n");
		printf("|1| Adding Players  			 \n");		  		 
		printf("|2| Removing Players			 \n");
		printf("|3| Search Players				 \n");
		printf("|4| Update Players				 \n");
		printf("|5| Display Sorted Players		 \n");
		printf("|6| Display All Players			 \n");
		printf("|7| Display top 3 Players		 \n");
		printf("|0| End 					     \n");
		printf("*********************************\n");
		
		printf("\nEnter your choice :- ");
		scanf("%d",&choice);
		printf("_______________________________________\n\n");
//	switch keyword use for switching function	
	switch (choice)
		{
			//	function call 

            case 1: addPlayer(&players,&count,&totalSize);
			break;
            case 2: removePlayer(players,&count); 
			break;
            case 3: searchPlayer(players,count);
			break;
            case 4: updatePlayer(players,count);
			break;
            case 5: displaySortedPlayers(players,count); 
			break;
            case 6: displayAllPlayers(players,count);
			break;
            case 7: displayTop3Players(players,count); 
			break;
            case 0: printf("Exiting...\n"); 
			break;
            default: printf("Invalid choice! Try again.\n");
    	}
    
	}
	while(choice != 0);
	free(players); // free memory 
	
	return 0;
}//main end

// Function Definitions for all functions

void addPlayer(Player **players, int *count, int *totalSize) 
{
//		 Step 1: Resize memory if memory is full
    	if(*count == *totalSize)
    	{
    		if(*totalSize==0) //if size and count both are 0 then SET size = 2(2 player)
			{
    			*totalSize = 2;
			}
    		else
			{
				*totalSize = *totalSize * 2;//if size and count both are non-zero then size will be Double = sixe * 2
			}
    		*players = realloc(*players, (*totalSize) * sizeof(Player));
    		
    		if(!*players) 
			{
			printf("------Memory allocation failed------\n");
			exit(1);
			}
		}
		
		// Step 2: Always ask for number of players to add	
		int n;
		printf("Enter the number how many players do you want to add    :-\n");
		printf("________________________________________________________\n");
    	scanf("%d", &n);
    	
			for(int i = 0; i < n; i++)
			{
				Player play;
				printf("Enter Jersey Number:- ");
		    	scanf("%d",&play.jersey_number);
		    	printf("Enter Name:- ");
		    	scanf(" %s",play.name);
		    	printf("Enter Runs:- ");
		    	scanf("%d",&play.runs);
		    	printf("Enter Wickets:- ");
		    	scanf("%d",&play.wickets);
		    	printf("Enter Matches Played:-");
		    	scanf("%d",&play.matches_played);
		    	
		    	(*players)[*count] = play;
		    	(*count)++;
		    	printf("\n------Player added successfully------\n\n");
			}
		
}

void removePlayer(Player players[], int *count) 
{
	int jerseyno;
	printf("Enter Player jersey number to remove            :- ");
	printf("\n________________________________________________\n");
	scanf("%d",&jerseyno);

		for(int i=0; i<*count; i++)
		{
			if(players[i].jersey_number == jerseyno)
			{
				for(int j=i; j<*count-1; j++)
				{
					players[j] = players[j+1];	
				}
				(*count)--;
				printf("------player removed successfully------\n");
				return;
			}
		}
				printf("player not found\n");		
}

void searchPlayer(Player players[], int count) 
{
	int jersey,found = 0;
	printf("Enter the jersey number        :- ");
	printf("\n_______________________________\n");
	scanf("%d",&jersey);
	
	for(int i=0; i<count; i++)
	{
		if(players[i].jersey_number == jersey)
		{
			printf("found \n");
			printf("Name: %s\n", players[i].name);
            printf("Runs: %d\n", players[i].runs);
            printf("Wickets: %d\n", players[i].wickets);
            printf("Matches Played: %d\n", players[i].matches_played);
            
            found = 1;
            break;
		}
		
	}
    if(!found)
		printf("----not found----\n");	
}

void updatePlayer(Player players[], int count) 
{
  int jersey;
	printf("Enter the jersey number     :- ");
	printf("\n____________________________\n");
	scanf("%d",&jersey);
	
	for(int i=0; i<count; i++)
	{
		if(players[i].jersey_number == jersey) 
		{
			printf("Enter new Name: ");
            scanf(" %s",players[i].name);
	    	printf("Enter New Run: ");
	    	scanf("%d",&players[i].runs);
	    	printf("Enter New Wickets: ");
	    	scanf("%d",&players[i].wickets);
	    	printf("Enter New Matches Played: ");
	    	scanf("%d",&players[i].matches_played);
	    	
	    	printf("------player updated successfully------\n");
	    	return;
		} 
	}
	printf("----not found----\n");
	
}

void displaySortedPlayers(Player players[], int count) 
{
	Player temp;
	Player tempplayers[count];
    for (int i = 0; i < count; i++) {
        tempplayers[i] = players[i];   // copy original array
    }
   for (int i = 0; i < count-1 ; i++) {
        for (int j = 0; j < count -i- 1; j++) {
            if (tempplayers[j].runs < tempplayers[j + 1].runs) 
			{
                // Swap
                temp = tempplayers[j];
                tempplayers[j] = tempplayers[j+1];
                tempplayers[j+1] = temp;
            }
        }
    }

    printf("Sorted All Players by Run:\n");
    printf("\nSorted Players :- \n");
    for (int i = 0; i < count; i++)
	 {
    		printf("|---------------------------------------------------------------------------------------------------------|\n");
			printf("|Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d    \n",tempplayers[i].jersey_number,tempplayers[i].name,tempplayers[i].runs,tempplayers[i].wickets,tempplayers[i].matches_played);
			printf("|---------------------------------------------------------------------------------------------------------|\n");

    }

}
//display start
void displayAllPlayers(Player players[], int count) 
{
	if(count==0)
	{
		printf("------no player to display------\n");		
	}
	else
	{
		printf(".........................\n");
		printf("|  Display All Players  |\n");
		printf("|.......................|\n");
		for(int i=0; i<count; i++)
		{
			printf("\nPlayers %d :- \n",i+1);
			printf("-----------------------------------------------------------------------------------------------------------------------\n");
			printf("Jersey Number = %-8d | Name = %-20s | Runs = %-8d | Wicket = %-9d | Played Matches = %-7d \n",players[i].jersey_number,players[i].name,players[i].runs,players[i].wickets,players[i].matches_played);
			printf("-----------------------------------------------------------------------------------------------------------------------\n");
			
		}	
	}  
}
//display end

//Top 3 start
void displayTop3Players(Player players[], int count) 
{

	Player temp;
	Player tempplayers[count];
    for (int i = 0; i < count; i++) {
        tempplayers[i] = players[i];   // copy original array
    }
    
    int choice;
	printf(".....................\n");
	printf("|  1 - By Run       |\n");
	printf("|...................|\n\n");
	
	printf(".....................\n");
	printf("|  2 - By Wicket    |\n");
	printf("|...................|\n");
	
	printf("\nEnter your choice (1 or 2): ");
	scanf("%d",&choice);
	printf("_______________________________________\n\n");
	
	if(choice==1) {
		for (int i = 0; i < count-1 ; i++)  {
			for (int j = 0; j < count-i-1 ; j++) {
				if(tempplayers[j].runs < tempplayers[j+1].runs) {
					temp=tempplayers[j];
					tempplayers[j]=tempplayers[j+1];
					tempplayers[j+1]=temp;
				}
			}
		}

		for(int i=0; i<count&&i<3 ; i++) {

			printf("|----------------------------------------------------------------------------------------------------------------|\n");
			printf("|Jersey_no: %d  |  Name:%s              |  Run: %d       |  Wicket: %d  |  Matches_Played: %d     \n",tempplayers[i].jersey_number,tempplayers[i].name,tempplayers[i].runs,tempplayers[i].wickets,tempplayers[i].matches_played);
			printf("|----------------------------------------------------------------------------------------------------------------|\n");

		}
	}

	else if(choice==2) {
		for(int i=0; i<count-1; i++) {
			for(int j=0; j<count-i-1; j++) {
				if(tempplayers[j].wickets<tempplayers[j+1].wickets) {
					temp=tempplayers[j];
					tempplayers[j]=tempplayers[j+1];
					tempplayers[j+1]=temp;
				}
			}
		}

		for(int i=0; i<count&&i<3 ; i++) {

			printf("|---------------------------------------------------------------------------------------------------------|\n");
			printf("|Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d    \n",tempplayers[i].jersey_number,tempplayers[i].name,tempplayers[i].runs,tempplayers[i].wickets,tempplayers[i].matches_played);
			printf("|---------------------------------------------------------------------------------------------------------|\n");

		}
	}
	else
		printf("\n----- Invalid Choice -----\n");
	
}
//Top 3 end 

//players  hardcoded data start
void playersinfo(Player* players){
	
	players[0].jersey_number=12;
	strcpy(players[0].name,"Shubhman_Gill");
	players[0].runs=2200;
	players[0].wickets=2;
	players[0].matches_played=80;
	
	players[1].jersey_number=18;
	strcpy(players[1].name,"Virat_kohli");
	players[1].runs=8618;
	players[1].wickets=4;
	players[1].matches_played=266;
	
	players[2].jersey_number=33;
	strcpy(players[2].name,"Suryakumar_Yadav");
	players[2].runs=6500;
	players[2].wickets=10;
	players[2].matches_played=150;
	
	players[3].jersey_number=32;
	strcpy(players[3].name,"Ishan_Kishan");
	players[3].runs=4500;
	players[3].wickets=16;
	players[3].matches_played=180;
	
	players[4].jersey_number=72;
	strcpy(players[4].name,"Tilak_Varma");
	players[4].runs=5500;
	players[4].wickets=17;
	players[4].matches_played=180;
	
	players[5].jersey_number=15;
	strcpy(players[5].name,"KL_Rahul");
	players[5].runs=4500;
	players[5].wickets=1;
	players[5].matches_played=120;
	
	players[6].jersey_number=7;
    strcpy(players[6].name,"Hardik_Pandya");
	players[6].runs=2500;
	players[6].wickets=120;
	players[6].matches_played=130;
	
	players[7].jersey_number=5;
	strcpy(players[7].name,"Ravindra_Jadeja");
	players[7].runs=3500;
	players[7].wickets=30;
	players[7].matches_played=180;
	
	players[8].jersey_number=16;
	strcpy(players[8].name,"Rishab_Pant");
	players[8].runs=3200;
	players[8].wickets=5;
	players[8].matches_played=90;
	
	players[9].jersey_number=19;
	strcpy(players[9].name,"Shreyash_Iyer");
	players[9].runs=4000;
	players[9].wickets=3;
	players[9].matches_played=120;
	
    players[10].jersey_number=45;
	strcpy(players[10].name,"Rohit_Sharma");
	players[10].runs=7000;
	players[10].wickets=15;
	players[10].matches_played=272;
	
}
//Project end here
