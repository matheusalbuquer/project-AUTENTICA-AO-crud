document.querySelector('form').addEventListener('submit', async function (event) {
    event.preventDefault(); // Impede o envio padrão do formulário

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    try {
        const response = await fetch('http://localhost:8080/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ username, password })
        });

        if (!response.ok) {
            throw new Error('Erro ao fazer login');
        }

        const data = await response.json();
        console.log('Login bem-sucedido:', data);

        // Redirecionar, salvar token, etc.
    } catch (error) {
        console.error('Erro:', error);
    }
});
