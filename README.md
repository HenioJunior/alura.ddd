### Java e Domain Driven Design

1. Ubiquitous Language

A ideia é justamente tentarmos criar uma linguagem universal, uma linguagem onipresente, que vai ser a ponte entre esses dois mundos, esses dois times: o time de desenvolvimento, as pessoas técnicas da área de desenvolvimento, que vão desenvolver o software em si; e o time, as pessoas da área de negócio, que são os especialistas do domínio.

O foco do DDD é o domínio da aplicação. Então nós precisamos pegar os termos que são usados pelos especialistas de negócio e tentar trazê-los para o código do jeito mais fiel possível, os mesmos termos que são falados durante as reuniões, durante as conversas.

2. Aggregates

 - Business invariant, é o nome técnico utilizado no mundo do Domain Driven Design, invariante de negócio. É uma validação, uma regra de negócio.

 Ex: Se um aluno tiver mais do que 2 telefones em nosso sistema, essa regra foi violada, logo, o Aluno estará em um estado inválido. Invariantes nada mais são do que regras de negócio que precisam ser verificadas para garantir sua consistência.

 `https://martinfowler.com/bliki/DDD_Aggregate.html`

 3. Eventos

 - Trabalhando com eventos, o mesmo evento pode gerar várias ações, o que nos dá muita flexibilidade.

 Ex: É muito comum isso quando temos um processo. Num site de compras online, você pode ter um processo de uma venda.
 Então, sempre que um pedido é efetuado, você pode disparar um evento e várias ações são tomadas: uma emissão de nota fiscal, o processamento do pagamento, envio de e-mail de confirmação da compra, enfim, então essas são atividades que são disparadas sempre que o evento de um pedido novo é realizado.

 4. Bounded Contexts

 Bounded Contexts, ou contextos delimitados, são um dos conceitos mais complexos de entender e implementar do estudo do DDD.
 Vale a pena leituras mais aprofundadas para conhecer técnicas que envolvem esse princípio.

 https://martinfowler.com/bliki/BoundedContext.html

 



 








