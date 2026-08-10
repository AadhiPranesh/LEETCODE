/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *t1= l1;
    struct ListNode *t2=l2;
    struct ListNode *head= NULL ,*t3=NULL;
    int sum=0;
    while(t1 || t2 || sum )
    {
        if(t1 != NULL)
        {
            sum= sum+t1->val;
            t1=t1->next;
        }
        if(t2 !=  NULL)
        {
            sum =sum+t2->val;
            t2= t2->next;

        }
        struct ListNode *n =(struct ListNode*)malloc(sizeof( struct ListNode));
        n->val=sum%10;
        sum= sum/10;
        if(head ==NULL)
        {
            head = t3=n;
            
        }
        else {
            t3->next=n;
            t3=n;

        }


    }
    t3->next= NULL;
 return head;
}