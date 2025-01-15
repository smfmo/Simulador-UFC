# 🥊 Simulador de UFC em Java

Este projeto é uma simulação de um campeonato de UFC, implementado em Java. O programa permite criar lutadores, organizá-los em lutas e determinar automaticamente o vencedor com base em categorias de peso e sorteios.

## 📋 Funcionalidades

- **Criação de Lutadores:** Cada lutador possui atributos como nome, nacionalidade, idade, altura, peso, categoria, vitórias, derrotas e empates.
- **Categorias de Peso:** O sistema classifica os lutadores nas categorias "Leve", "Médio", "Pesado" ou "Inválido" com base em seu peso.
- **Agendamento de Lutas:** Somente lutadores da mesma categoria podem lutar. Lutas inválidas são canceladas.
- **Simulação de Lutas:** Determina o vencedor ou empate de forma aleatória, atualizando os registros dos lutadores.
- **Apresentação e Status dos Lutadores:** Exibe detalhes sobre os lutadores e suas estatísticas.

## 🛠️ Estrutura do Código

### **1. Classe Principal (`Main`)**
O ponto de entrada do programa, onde os lutadores são criados e lutas podem ser simuladas.

### **2. Classe Lutador**
Define os atributos e comportamentos de um lutador. Inclui métodos para apresentar o lutador, atualizar seu status e gerenciar resultados de lutas.

### **3. Classe Luta**
Controla as regras e a execução de uma luta. Inclui métodos para verificar compatibilidade entre lutadores, iniciar a luta e determinar o vencedor.

## 📂 Organização das Classes

- `Main`: Gerencia o fluxo principal do programa.
- `Lutador`: Representa cada lutador, com atributos como nome, peso, e métodos para modificar estatísticas.
- `Luta`: Gerencia a lógica das lutas, como validação de categorias e sorteio de resultados.

### Exemplo de Execução

Na classe `Main`, crie lutadores, agende uma luta e simule-a:
```java
Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
Lutador lutador2 = new Lutador("PutsCript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

Luta luta = new Luta();
luta.marcarLuta(lutador1, lutador2);
luta.lutar();
