# Compiler's Behavior
Compiler's behavior as mentioned in Java books can be proved with the `javap` tool from *JDK*
## Autoboxing
### [Example Autoboxing of `int`]()
<table>
	<col width="50%">
  	<col width="50%">
	<tr>
		<th><pre>Integer autoboxedInteger = 201;</pre></th>		
		<th><pre>Integer integer = Integer.valueOf(201);</pre></th>
	</tr>
	<tr>
		<td>
<pre>
0: sipush        201
3: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
</pre>
		</td>	
		<td>
<pre>
7: sipush        201
10: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
</pre>
		</td>
	</tr>
</table>





