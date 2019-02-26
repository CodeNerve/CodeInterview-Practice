
From the question perspective, the solution should be more careful about memory rather than time. We'd have to take a very big array, to start with making three stacks in a single array.
So my steps for making such stack"ed" array would be,

- Take very big one array
    * Possibly concerntrating on the inputs that we would recieve, is this going to have integers, floats or objects or anything like that.
    
- Part the array to have two stacks growing in opposite directions, reaching towards end, with the third stack starting from the middle of the array and go in one direction (say right).
    * Now as the first two arrays are growing in opposite directions, we have to keep check when they reach the end and after that every push statement will be time costly as we'd have to shift the stack and then place the element.
    
    
