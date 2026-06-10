
<div align="center">

<h1>🔐 Cifrador de Texto por Salto de Índice</h1>

<p>
Projeto desenvolvido em <strong>Java</strong> que realiza uma cifragem simples baseada na reorganização de caracteres através de saltos de índice.
</p>

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Projeto-Educacional-blue?style=for-the-badge">

</div>

<hr>

<h2>📖 Sobre o Projeto</h2>

<p>
Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais da linguagem Java, incluindo manipulação de strings, expressões regulares, estruturas de repetição e algoritmos de cifragem.
</p>

<p>
O programa recebe um texto informado pelo usuário, remove espaços e pontuações, converte o conteúdo para letras maiúsculas e gera uma nova sequência de caracteres utilizando uma lógica de deslocamento baseada em saltos de índice.
</p>

<hr>

<h2>⚙️ Como Funciona</h2>

<ol>
<li>Recebe um texto digitado pelo usuário.</li>
<li>Remove espaços e caracteres especiais.</li>
<li>Converte todas as letras para maiúsculas.</li>
<li>Percorre o texto utilizando saltos de 3 posições.</li>
<li>Gera uma nova sequência cifrada.</li>
</ol>

<h3>Exemplo</h3>

<p><strong>Entrada:</strong></p>

<pre>
Olá, Mundo!
</pre>

<p><strong>Texto processado:</strong></p>

<pre>
OLAMUNDO
</pre>

<p><strong>Lógica utilizada:</strong></p>

<pre>
indice = (indice + 3) % tamanhoP;
</pre>

<hr>

<h2>🛠️ Tecnologias Utilizadas</h2>

<ul>
<li>Java</li>
<li>JDK 8+</li>
<li>Scanner</li>
<li>Regex</li>
</ul>

<hr>

<h2>📂 Estrutura do Projeto</h2>

<pre>
📦 Projeto
 ┣ 📜 limpador.java
 ┗ 📜 README.md
</pre>

<hr>

<h2>🚀 Executando o Projeto</h2>

<h3>Compilar</h3>

<pre>
javac limpador.java
</pre>

<h3>Executar</h3>

<pre>
java limpador
</pre>

<hr>

<h2>🎯 Objetivos de Aprendizagem</h2>

<ul>
<li>Desenvolver lógica de programação.</li>
<li>Manipular strings em Java.</li>
<li>Aplicar expressões regulares.</li>
<li>Utilizar o operador módulo (%).</li>
<li>Compreender algoritmos de reorganização de dados.</li>
</ul>
<hr>
<h2>📄 Licença</h2>
<p>
Projeto desenvolvido para fins educacionais e acadêmicos.
</p>
<hr>
<h2>👨‍💻 Desenvolvedor</h2>
<i>Projeto desenvolvido por estudante do 2º ano de Desenvolvimento de Sistemas - ETEC</i>
<br><br>
<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/Lucxzhhh">
        <img src="https://github.com/user-attachments/assets/b0f08778-8ee4-4370-a426-2c43b95f3b1a" width="140"><br>
        <b>Lucxzhhh</b>
      </a>
    </td>
  </tr>
</table>
<br>
<div align="center">
⭐ Se gostou do projeto, considere deixar uma estrela no repositório.
</div>
```
