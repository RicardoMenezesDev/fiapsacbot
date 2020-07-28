# fiapsacbot - Atividade Avaliativa da Disciplina de Java Platform

Este projeto tem como objeto a criação de um chat com respostas pré-definidas em um dicionário.

O projeto está dividido nas seguintes estruturas:
  - Configuração
  - Serviços
  - Domínios (Aluno, Apostila, Aula, boleto, disciplina, trabalho)
  
Estrutura de Configuração 

 # MensagemEnumConfig.java
 
 Enumerador responsável persistir todas as mensagens iniciais do chatbot.
 
Métodos:
- getDescricao - Retorna a descrição de uma mensagem inicial do chatbot;

 # TelegramEnumConfig.java
 
 Enumerador responsável persistir as configurações do chatbot como Token e Usuário.
 
 Estrutura de Serviço
 
 # FiapSacBotServico.java
 
 Principal classe do chatbot estendida da classe TelegramLongPollingBot da biblioteca do Telegram.
 Nela temos os principais métodos sobrescritos da classe TelegramLongPollingBot (onUpdateReceived, getBotUsername egetBotToken) para recebimento de mensagem atualizada e recuperação de token e usuario. 
 
 Novos Métodos:
 
  - recuperaAluno() - Recupera as informações do usuário ativo na aplicação.
  - limparFilaAluno() - Realiza a limpeza do usuário que está ativo com chat encerrado. 
  - controleAcesso() - Realiza o controle de transação por usuário ativo na aplicação.
  
  # DicionarioSinonimosServico.java
  
  Classe responsável por persistir os sinônimos das palavras utilizadas no índice do chatbot.
  
  # MensagemServico.java
  
  Classe responsável por verificar a existência de uma nova mensagem enviada pelo usuário ativo.
  
  # FluxoMensagemServico.java
  
  Classe responsável por definir o fluxo de mensagem guiada através das opções do chatbot.
  
  Estrutura de Domínios
  
  Para cada domínio foi criado um dicionário (Enum) de respostas prontas e uma classe de serviço para direcionar as respostas de acordo com o sinônimo informado.
  
  # Apostila
  ApostilaEnum.java - Dicionário de resposta para a domínio de apostila.
  ApostiaServico - Classe para identificação e direcionamento das respostas do domínio de apostila.
  
  # Aula
  - AulaEnum - Dicionário de resposta para a domínio de aula.
  - AulaServico - Classe para identificação e direcionamento das respostas do domínio de aula.
  
  # Boleto
  - BoletoEnum - Dicionário de resposta para a domínio de boleto.
  - BoletoServico - Classe para identificação e direcionamento das respostas do domínio de boleto.
  
  # Disciplina
  - DisciplinaEnum - Dicionário de resposta para a domínio de disciplina.
  - DisciplinaServico - Classe para identificação e direcionamento das respostas do domínio de disciplina.
  
  # Trabalho
  - TrabalhoEnum - Dicionário de resposta para a domínio de trabalho.
  - TrabalhoServico - Classe para identificação e direcionamento das respostas do domínio de trabalho.

  
