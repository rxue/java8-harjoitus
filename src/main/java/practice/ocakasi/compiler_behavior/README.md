# Compiler's Behavior
Compiler's behavior as mentioned in Java books can be proved with the `javap` tool from *JDK*
## Autoboxing
### [Example Autoboxing of `int`]()
<table>
	<col width="20">
  	<col width="20">
	<tr>
		<th><code>Integer autoboxedInteger = 201;</code></th>		
		<th><code>Integer integer = Integer.valueOf(201);</code></th>
	</tr>
	<tr>
		<td>
<code>
0: sipush        201
3: invokestatic  #16
// Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
</code>
		</td>	
		<td>
<code><pre>
7: sipush        201
10: invokestatic  #16	
// Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
</pre></code>
		</td>
	</tr>
</table>





