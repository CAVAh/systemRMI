# Sistema de RMI

Foi implementado um sistema utilizando RMI de uma conta corrente na qual foram criados métodos de depósito, saque e saldo da conta. 

### Diferença do código com e sem synchronized:

O código utilizando synchronized não permite que o método seja acessado por dois clientes ao mesmo tempo. 

E o código que não utiliza synchronized permite que o método seja acessado por mais que um cliente ao mesmo tempo, podendo ocasionar problemas. 

### Teste: 

O teste foi realizado utilizando uma conta corrente que continha saldo inicial igual 0, sendo depositado 10, e após sendo feita retirada de 4,5.

Com o synchronized esse teste teria o valor de 5,5 (pelo primeiro cliente).

Nos demais casos, onde não seria utilizado o synchronized poderia haver divergência no valor.

Código sem Synchronized na pasta RMI e com Synchronized na pasta RMI_Synchronized.
