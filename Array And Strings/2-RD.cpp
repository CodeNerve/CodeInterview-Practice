#include<string>
#include<iostream>
#include<map>
using namespace std;

int main()
{

	string str1,str2;
	
	getline(cin,str1);
	getline(cin,str2);

	map <char,int> char1,char2;
	
	if(str1.size()!=str2.size())
	{
		cout<<"Strings are NOT permutations of each other!"<<endl;
		return 1;
	}
	
	int flag=0;
	
	for(int i=0;i<str1.size();i++)
	char1[str1[i]]++;
	
	for(int i=0;i<str2.size();i++)
	char2[str2[i]]++;
	
	for(int i=0;i<str1.size();i++)
	{
		if(char1[str1[i]]!=char2[str1[i]])
		{
			flag++;
			break;
		}
	}
	
	if(flag)
	{
		cout<<"Strings are NOT permutations of each other!"<<endl;
		return 1;
	}
	
	cout<<"Strings are permutations of each other!"<<endl;
	

return 0;
}
