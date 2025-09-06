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

//function declarations
void addPlayer(Player**,int*,int*);
void removePlayer(Player[],int*);
void searchPlayer(Player[],int);
void updatePlayer(Player[],int);
void displaySortedPlayers(Player[],int);
void displayAllPlayers(Player[],int);
void displayTop3PlayersByRuns(Player[],int);
void displayTop3PlayersByWickets(Player[],int);



int main()  //main start
{
Player *players=NULL;
int count = 0;
int size = 0;

 players = (Player *)malloc(size * sizeof(Player));
    if (players == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

int choice;
//do while loop
	do{
		printf("Player Management System\n");
		printf("1: Adding Players\n");
		printf("2: Removing Players\n");
		printf("3: Search Players\n");
		printf("4: Update Players\n");
		printf("5: Display Sorted Players\n");
		printf("6: Display top Players\n");
		printf("7: Display top 3 Players By run\n");
		printf("8: Display top 3 Players By Wickets\n");
		printf("0: End");
		
		printf("Enter your choice :- ");
		scanf("%d",&choice);
//	switch keyword use for switching function	
	switch (choice)
		{
			//	function call 

            case 1: addPlayer(&players,&count,&size);
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
            case 7: displayTop3PlayersByRuns(players,count); 
			break;
			case 8: displayTop3PlayersByWickets(players,count); 
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

void addPlayer(Player **players, int *count, int *size) 
{
    	if(*count == *size)
    	{
    		if(*size==0) //if size and count both are 0 then SET size = 2(2 player)
			{
    			*size = 2;
			}
    		else
			{
				*size = *size * 2;//if size and count both are non-zero then size will be Double = sixe * 2
			}
    		*players = realloc(*players, (*size) * sizeof(Player));
    		
    		if(!*players) 
			{
			printf("Memory allocation failed!\n");
			exit(1);
			}
		}
		else
		{
		int n;
		printf("Enter the number how many players do you want to add ");
    	scanf("%d", &n);
			for(int i = 0; i < n; i++)
			{
				Player play;
				printf("Enter Jersey Number: ");
		    	scanf("%d",&play.jersey_number);
		    	printf("Enter Name: ");
		    	scanf(" %s",play.name);
		    	printf("Enter Runs: ");
		    	scanf("%d",&play.runs);
		    	printf("Enter Wickets: ");
		    	scanf("%d",&play.wickets);
		    	printf("Enter Matches Played: ");
		    	scanf("%d",&play.matches_played);
		    	
		    	(*players)[*count] = play;
		    	(*count)++;
		    	printf("Player added successfully\n\n");
			}
		}
}

void removePlayer(Player players[], int *count) 
{
	int jerseyno;
	printf("Enter Player jersey number to remove :- ");
	scanf("%d",&jerseyno);

		for(int i=0; i<*count; i++)
		{
			if(players[i].jersey_number == jerseyno)
			{
				for(int j=i; j<*count-1; j++)
				{
					players[j] = players[j+1];	
				}
				count--;
				printf("player removed successfully\n");
				return;
			}
		}
				printf("player not found\n");		
}

void searchPlayer(Player players[], int count) 
{
	int jersey,found = 0;
	printf("Enter the jersey number :- ");
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
		printf("not found \n");	
}

void updatePlayer(Player players[], int count) 
{
  int jersey;
	printf("Enter the jersey number :- ");
	scanf("%d",&jersey);
	
	for(int i=0; i<count; i++)
	{
		if(players[i].jersey_number == jersey) 
		{
			printf("Enter new run \n");
			
	    	printf("Enter New Runs: ");
	    	scanf("%d",&players[i].runs);
	    	printf("Enter New Wickets: ");
	    	scanf("%d",&players[i].wickets);
	    	printf("Enter New Matches Played: ");
	    	scanf("%d",&players[i].matches_played);
	    	
	    	printf("player updated successfully\n");
	    	return;
		} 
	}
	printf("not found \n");
	
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
            if (tempplayers[j].runs > tempplayers[j + 1].runs) 
			{
                // Swap
                temp = tempplayers[j];
                tempplayers[j] = tempplayers[j+1];
                tempplayers[j+1] = temp;
            }
        }
    }

    printf("Sorted All Players by Run:\n");
    for (int i = 0; i < count; i++) {
        printf("Jersey number = %d\nName = %s\nRuns = %d\nWickets = %d\nMatches Played = %d \n\n",
		tempplayers[i].jersey_number,tempplayers[i].name,tempplayers[i].runs ,tempplayers[i].wickets ,
		tempplayers[i].matches_played);
    }

}

void displayAllPlayers(Player players[], int count) 
{
	if(count==0)
	{
		printf(" no player to display \n");		
	}
	else
	{
		for(int i=0; i<count; i++)
		{
			printf("Display All Players :- \n", i+1);
			printf("Jersey Number = %d \n",players[i].jersey_number);
			printf("Name = %s \n",players[i].name);
			printf("Runs = %d \n",players[i].runs);
			printf("Wicket = %d \n",players[i].wickets);
			printf("Played Matches = %d \n",players[i].matches_played);
		}	
	}  
}

void displayTop3PlayersByRuns(Player players[], int count) 
{
	Player temp;
	if(count==0)
	{
		printf(" no player to display \n");		
	}
	else{
	
   for (int i = 0; i < count-1 ; i++) 
   {
        for (int j = i+1; j < count ; j++) 
		{
            if (players[i].runs < players[j].runs) 
			{
                // Swap
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
    }
}
    printf("Sorted Top 3 Players by Run:\n");
    for (int i = 0; i < count && i< 3; i++) 
	{
        printf("Jersey number = %d\nName = %s\nRuns = %d\nWickets = %d\nMatches Played = %d \n\n",
		players[i].jersey_number,players[i].name,players[i].runs ,players[i].wickets ,players[i].matches_played);
    }
}

void displayTop3PlayersByWickets(Player players[], int count) 
{
	 Player temp;
   for (int i = 0; i < count-1 ; i++) 
   {
        for (int j = i+1; j < count ; j++) 
		{
            if (players[i].wickets < players[j].wickets) 
			{
                // Swap
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
    }

    printf("Sorted Top 3 Players by Wickets:");
    for (int i = 0; i < count && i < 3; i++) 
	{
       printf("Jersey number = %d\nName = %s\nRuns = %d\nWickets = %d\nMatches Played = %d \n\n",
		players[i].jersey_number,players[i].name,players[i].runs ,players[i].wickets ,players[i].matches_played);
    }
	
}