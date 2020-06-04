### Tasking
1.  Given 每一轮的两次扔球都没有碰到球 When 计算总得分 Then 总得分为0   
1.  Given 每一轮的两次扔球都没有全部击倒球瓶 When 计算总得分 Then 总得分为每次扔球的倒瓶数总和  
1.  存在一轮SPARE
    -  Given 第9轮SPARE其余每轮的两次扔球都没有全部击倒球瓶  When 计算总得分 Then 总得分为每次扔球的倒瓶数总和再加SPARE轮后的一球的倒瓶数   
    -  Given 第10轮SPARE其余每轮的两次扔球都没有全部击倒球瓶  When 计算总得分 Then 总得分为每次扔球的倒瓶数总   
1.  存在一轮STRIKE
    -  Given 第9轮STRIKE其余每轮的两次扔球都没有全部击倒球瓶  When 计算总得分 Then 总得分为每次扔球的倒瓶数总和再加STRIKE轮后两球的倒瓶数   
    -  Given 第10轮SPARE其余每轮的两次扔球都没有全部击倒球瓶  When 计算总得分 Then 总得分为每次扔球的倒瓶数总     
1.  Given 十轮均为STRIKE When 计算总得分 Then 总得分为300      
