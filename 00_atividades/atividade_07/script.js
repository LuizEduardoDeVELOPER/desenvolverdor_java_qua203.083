// script.js
document.addEventListener('DOMContentLoaded', () => {
  const overlay = document.getElementById('overlay');
  const modal = document.getElementById('welcomeModal');
  const closeBtn = document.getElementById('closeBtn');
  const joinBtn = document.getElementById('joinBtn');
  const nahBtn = document.getElementById('nahBtn');

  // função para mostrar modal
  function showModal(){
    overlay.classList.remove('hidden');
    modal.classList.remove('hidden');
    // animação simples
    modal.style.transform = 'translate(-50%,-50%) scale(0.96)';
    setTimeout(()=> { modal.style.transition = 'transform .18s ease'; modal.style.transform = 'translate(-50%,-50%) scale(1)'; }, 10);
  }

  function hideModal(){
    modal.style.transform = 'translate(-50%,-50%) scale(0.98)';
    overlay.classList.add('hidden');
    setTimeout(()=> {
      modal.classList.add('hidden');
      modal.style.transition = '';
      modal.style.transform = 'translate(-50%,-50%)';
    }, 180);
  }

  // abre ao carregar (simulando login)
  setTimeout(showModal, 600);

  closeBtn.addEventListener('click', hideModal);
  overlay.addEventListener('click', hideModal);

  joinBtn.addEventListener('click', ()=>{
    alert('Entrando no cast!');
    hideModal();
  });

  nahBtn.addEventListener('click', ()=>{
    hideModal();
  });

  // fechar com Esc
  document.addEventListener('keydown', (e) => {
    if(e.key === 'Escape') hideModal();
  });
});
